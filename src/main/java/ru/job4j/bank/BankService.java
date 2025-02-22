package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает логику работы банка. Включает в себя
 * возможность добавления нового клиента, создания счёта,
 * поиска клиентов в системе по номеру паспорта и реквизитам,
 * а также совершение денежных переводов.
 * @author DENIS TRUNOV
 * @version 1.0
 */
public class BankService {

    /**
     * Все клиенты банка хранятся в коллекции типа HashMap,
     * где ключом является клиент банка, а значением
     * список банковских счетов этого клиента.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход клиента банка и добавляет его
     * в коллекцию с пустым списком банковских счетов,
     * если такого клиента в коллекции не было.
     * @param user клиент, которого нужно добавить.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход номер паспорта клиента и банковский счёт,
     * проверяет по паспорту существование клиента в системе и
     * если клиент найден, то привязывает указанный счёт к этому клиенту.
     * @param passport номер паспорта клиента, которому нужно добавить счёт.
     * @param account счёт, который нужно добавить клиенту.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход номер паспорта клиента
     * и осуществляет поиск клиента в системе.
     * @param passport номер паспорта, по которому выполняется поиск.
     * @return возвращает клиента банка или null, если клиент не найден.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод принимает на вход номер паспорта клиента и реквизиты счёта,
     * ищет клиента по номеру паспорта и в списке счетов найденного клиента
     * выполняет поиск конкретного счёта по реквизитам. Если клиент или счёт
     * не найден, метод возвращает null.
     * @param passport номер паспорта, по которому выполняется поиск клиента.
     * @param requisite реквизиты счёта, по которым выполняется поиск счёта.
     * @return возвращает счёт клиента или null, если клиент или счёт не найден.
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(acc -> acc.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод осуществляет перевод денег между двумя счетами. На вход принимает
     * номер паспорта отправитля, реквизиты счёта отправителя, номер паспорта
     * получателя, реквизиты счёта получателя, а так же сумму средств для перевода.
     * Перед выполнением перевода метод проверяет существование отправителя
     * и получателя, существование указанных счетов, а так же наличие необходимого
     * количества денег на счёте отправителя. Метод возвращает true, если перевод
     * выполнен или false, если не найдены клиенты банка или их счета, а также если
     * на счёте отправителя недостаточно денег для перевода.
     * @param srcPassport номер паспорта отправителя.
     * @param srcRequisite реквизиты счёт отправителя.
     * @param destPassport номер паспорт получателя.
     * @param destRequisite реквизиты счёта получателя.
     * @param amount сумма, которую необходимо перевести.
     * @return возвращает true, если перевод выполнен или false, если не найден
     * отправитель или получатель, или их счета,
     * или недостаточно денег на счёте отправителя.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        Optional<Account> senderAccount
                = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> recipientAccount
                = findByRequisite(destPassport, destRequisite);
        if (senderAccount.isPresent() && recipientAccount.isPresent()) {
            if (senderAccount.get().getBalance() >= amount) {
                senderAccount.get()
                        .setBalance(senderAccount.get().getBalance() - amount);
                recipientAccount.get()
                        .setBalance(recipientAccount.get().getBalance() + amount);
                return true;
            }
        }
        return false;
    }
}
