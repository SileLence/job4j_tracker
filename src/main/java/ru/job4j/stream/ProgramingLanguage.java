package ru.job4j.stream;

public class ProgramingLanguage {
    private String name;
    private int releaseDate;
    private String creator;
    private String developer;
    private String level;
    private String typing;
    private boolean oop;
    private String website;
    private String actualRelease;

    @Override
    public String toString() {
        return "ProgramingLanguage{"
                + "name='" + name + '\''
                + ", releaseDate=" + releaseDate
                + ", creator='" + creator + '\''
                + ", developer='" + developer + '\''
                + ", level='" + level + '\''
                + ", typing='" + typing + '\''
                + ", oop=" + oop
                + ", website='" + website + '\''
                + ", actualRelease='" + actualRelease + '\''
                + '}';
    }

    static class Builder {
        private String name;
        private int releaseDate;
        private String creator;
        private String developer;
        private String level;
        private String typing;
        private boolean oop;
        private String website;
        private String actualRelease;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildReleaseDate(int releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        Builder buildCreator(String creator) {
            this.creator = creator;
            return this;
        }

        Builder buildDeveloper(String developer) {
            this.developer = developer;
            return this;
        }

        Builder buildLevel(String level) {
            this.level = level;
            return this;
        }

        Builder buildTyping(String typing) {
            this.typing = typing;
            return this;
        }

        Builder buildOop(boolean oop) {
            this.oop = oop;
            return this;
        }

        Builder buildWebsite(String website) {
            this.website = website;
            return this;
        }

        Builder buildActualRelease(String actualRelease) {
            this.actualRelease = actualRelease;
            return this;
        }

        ProgramingLanguage build() {
            ProgramingLanguage pl = new ProgramingLanguage();
            pl.name = name;
            pl.releaseDate = releaseDate;
            pl.creator = creator;
            pl.developer = developer;
            pl.level = level;
            pl.typing = typing;
            pl.oop = oop;
            pl.website = website;
            pl.actualRelease = actualRelease;
            return pl;
        }
    }

    public static void main(String[] args) {
        ProgramingLanguage pl = new Builder()
                .buildName("Java")
                .buildReleaseDate(1995)
                .buildCreator("James Gosling")
                .buildDeveloper("Oracle")
                .buildLevel("High-Level")
                .buildTyping("Strong")
                .buildOop(true)
                .buildWebsite("https://www.oracle.com/java/")
                .buildActualRelease("Java SE 17")
                .build();
        System.out.println(pl);
    }
}
