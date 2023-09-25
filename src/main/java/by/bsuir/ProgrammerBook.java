package by.bsuir;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String language, int level) {
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || (obj.getClass() != getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return ((language.equals(programmerBook.language)
                && (level == programmerBook.level)));
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 31 * hash + (this.language != null ? this.language.hashCode() : 0);
        hash = 31 * hash + this.level;
        return hash;
    }

    @Override
    public String toString() {
        return "[Язык программирования: "
                + this.language
                + "; Уровень языка: "
                + this.level
                + "]";
    }
}
