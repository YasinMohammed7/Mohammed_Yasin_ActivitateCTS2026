public class PachetFarmacie {
    private boolean hasCrema;
    private boolean hasSupliment;
    private boolean hasComprimate;

    private PachetFarmacie(PachetFarmacieBuilder builder) {
        this.hasCrema = builder.hasCrema;
        this.hasSupliment = builder.hasSupliment;
        this.hasComprimate = builder.hasComprimate;
    }

    public boolean isHasCrema() {
        return hasCrema;
    }

    public boolean isHasSupliment() {
        return hasSupliment;
    }

    public boolean isHasComprimate() {
        return hasComprimate;
    }

    public static PachetFarmacieBuilder builder() {
        return new PachetFarmacieBuilder();
    }

    public static class PachetFarmacieBuilder implements Builder {
        private boolean hasCrema;
        private boolean hasSupliment;
        private boolean hasComprimate;

        public PachetFarmacieBuilder setHasCrema(boolean hasCrema) {
            this.hasCrema = hasCrema;
            return this;
        }

        public PachetFarmacieBuilder setHasSupliment(boolean hasSupliment) {
            this.hasSupliment = hasSupliment;
            return this;
        }

        public PachetFarmacieBuilder setHasComprimate(boolean hasComprimate) {
            this.hasComprimate = hasComprimate;
            return this;
        }

        public PachetFarmacie build(){
            return new PachetFarmacie(this);
        }
    }
}