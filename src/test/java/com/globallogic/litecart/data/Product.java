package com.globallogic.litecart.data;

public class Product {
    private String productName;
    private boolean enabled;
    private boolean root;
    private boolean rubberDucks;
    private String defaultCategory;
    private String dateValidFrom;
    private String dateValidTo;
    private String manufacturer;
    private String supplier;
    private String code;
    private String sku;
    private String mpn;
    private String gtin;
    private String taric;
    private String keywords;
    private String fileName;

    private String shortDescription;
    private String description;
    private String technicalData;
    private String headTitle;
    private String metaDescription;

    private int purchasePrice;
    private String currencyCode;
    private String taxClass;
    private int priceUSD;
    private int priceEUR;
    private int priceUSDinclTax;
    private int priceEURinclTax;

    public static Builder newEntity() {
        return new Product().new Builder();
    }

    public String getProductName() {
        return productName;
    }

    public String getCode() {
        return code;
    }

    public String getSKU() {
        return sku;
    }

    public String getMPN() {
        return mpn;
    }

    public String getGTIN() {
        return gtin;
    }

    public String getTARIC() {
        return taric;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getFileName() {
        return fileName;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public boolean getRoot() {
        return root;
    }

    public boolean getRubberDucks() {
        return rubberDucks;
    }

    public String getDefaultCategory() {
        return defaultCategory;
    }

    public String getDateValidFrom() {
        return dateValidFrom;
    }

    public String getDateValidTo() {
        return dateValidTo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSupplier() {
        return supplier;
    }

    // ---------------------------------------

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnicalData() {
        return technicalData;
    }

    public String getHeadTitle() {
        return headTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    //----------------------------------------------

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getPriceUSD() {
        return priceUSD;
    }

    public int getPriceEUR() {
        return priceEUR;
    }

    public int getPriceUSDinclTax() {
        return priceUSDinclTax;
    }

    public int getPriceEURinclTax() {
        return priceEURinclTax;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public class Builder {
        private Builder() {
        }

        public Builder withProductName(String productName) {
            Product.this.productName = productName;
            return this;
        }

        public Builder withEnabled(boolean enabled) {
            Product.this.enabled = enabled;
            return this;
        }

        public Builder withRoot(boolean root) {
            Product.this.root = root;
            return this;
        }

        public Builder withRubberDucks(boolean rubberDucks) {
            Product.this.rubberDucks = rubberDucks;
            return this;
        }

        public Builder withDefaultCategory(String defaultCategory) {
            Product.this.defaultCategory = defaultCategory;
            return this;
        }

        public Builder withDateValidFrom(String dateValidFrom) {
            Product.this.dateValidFrom = dateValidFrom;
            return this;
        }

        public Builder withDateValidTo(String dateValidTo) {
            Product.this.dateValidTo = dateValidTo;
            return this;
        }

        public Builder withManufacturer(String manufacturer) {
            Product.this.manufacturer = manufacturer;
            return this;
        }

        public Builder withSupplier(String supplier) {
            Product.this.supplier = supplier;
            return this;
        }

        public Builder withCode(String code) {
            Product.this.code = code;
            return this;
        }

        public Builder withSKU(String sku) {
            Product.this.sku = sku;
            return this;
        }

        public Builder withMPN(String mpn) {
            Product.this.mpn = mpn;
            return this;
        }

        public Builder withGTIN(String gtin) {
            Product.this.gtin = gtin;
            return this;
        }

        public Builder withTARIC(String taric) {
            Product.this.taric = taric;
            return this;
        }

        public Builder withKeywords(String keywords) {
            Product.this.keywords = keywords;
            return this;
        }

        public Builder withFile(String fileName) {
            Product.this.fileName = fileName;
            return this;
        }

        public Builder withShortDescription(String shortDescription) {
            Product.this.shortDescription = shortDescription;
            return this;
        }

        public Builder withDescription(String description) {
            Product.this.description = description;
            return this;
        }

        public Builder withTechnicalData(String technicalData) {
            Product.this.technicalData = technicalData;
            return this;
        }

        public Builder withHeadTitle(String headTitle) {
            Product.this.headTitle = headTitle;
            return this;
        }

        public Builder withMetaDescription(String metaDescription) {
            Product.this.metaDescription = metaDescription;
            return this;
        }

        public Builder withPurchasePrice(int purchasePrice) {
            Product.this.purchasePrice = purchasePrice;
            return this;
        }

        public Builder withCurrencyCode(String currencyCode) {
            Product.this.currencyCode = currencyCode;
            return this;
        }

        public Builder withTaxClass(String taxClass) {
            Product.this.taxClass = taxClass;
            return this;
        }

        public Builder withPriceUSD(int priceUSD) {
            Product.this.priceUSD = priceUSD;
            return this;
        }

        public Builder withPriceEUR(int priceEUR) {
            Product.this.priceEUR = priceEUR;
            return this;
        }

        public Builder withPriceUSDinclTax(int priceUSDinclTax) {
            Product.this.priceUSDinclTax = priceUSDinclTax;
            return this;
        }

        public Builder withPriceEURinclTax(int priceEURinclTax) {
            Product.this.priceEURinclTax = priceEURinclTax;
            return this;
        }

        public Product build() {
            return Product.this;
        }
    }
}

