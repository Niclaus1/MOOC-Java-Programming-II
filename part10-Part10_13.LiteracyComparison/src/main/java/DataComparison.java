public class DataComparison {
    private String theme;
    private String ageGroup;
    private String gender;
    private String Country;
    private int years;
    private double literacyPercent;

    public DataComparison(String theme, String ageGroup, String gender, String country, int years,
            double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.Country = country;
        this.years = years;
        this.literacyPercent = literacyPercent;
    }

    public String getTheme() {
        return theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return this.gender.replace("(%)", "").trim();
    }

    public String getCountry() {
        return Country;
    }

    public int getYears() {
        return years;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return getCountry() + " (" + getYears() + "), " + getGender() + ", " + getLiteracyPercent();
    }
}
