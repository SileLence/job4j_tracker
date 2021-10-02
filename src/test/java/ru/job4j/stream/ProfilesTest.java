package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProfilesTest {

    @Test
    public void whenCollectAddresses() {
        Address address1 = new Address(
                "Moscow",
                "3rd Builders st.",
                25,
                12);
        Address address2 = new Address(
                "Saint-Petersburg",
                "3rd Builders st.",
                25,
                12
        );
        Address address3 = new Address(
                "Voronezh",
                "Revolution prospect",
                19,
                5
        );
        List<Profile> profileList = List.of(
                new Profile(address1),
                new Profile(address2),
                new Profile(address3)
        );
        List<Address> expected = List.of(
                address1,
                address2,
                address3
        );
        List<Address> actual = new Profiles().collect(profileList);
        Assert.assertEquals(expected, actual);
    }

}
