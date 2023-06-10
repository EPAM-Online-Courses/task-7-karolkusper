package efs.task.reflection.json;


import com.fasterxml.jackson.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO: Użyj tu odpowiednich adnotacji z biblioteki Jackson
 */
@JsonIgnoreProperties(ignoreUnknown=true) //nieznane atrybuty powinny być ignorowane i nie powodować błędu
@JsonInclude(JsonInclude.Include.NON_NULL) //puste atrybuty powinny być pomijane przy generowaniu JSON
@JsonPropertyOrder({"ProductID", "ProductName", "ProductPrice", "DateOfProduction", "DateOfExpiry"})
//atrybuty powinny byc; generowane zawsze w tej samej kolejnosci tj. ProductID, ProductName, ProductPrice, DateOfProduction, DateOfExpiry,

/*
* pola klasy efs.task.reflection.json.ProductDTO powinny być mapowane do następujących elementów JSON:
ProductDTO.id naProductID w formacie JSON,
ProductDTO.name naProductName w formacie JSON,
ProductDTO.price naProductPrice w formacie JSON,
ProductDTO.expiryDate naDateOfExpiry w formacie JSON w następującym formacie yyyy-MM-dd,
ProductDTO.productionDate naDateOfProduction w formacie JSON w następującym formacie yyyy-MM-dd@HH:mm:ss
* */
public class ProductDTO {
    @JsonProperty("ProductID")
    private Long id;
    @JsonProperty("ProductName")
    private String name;
    @JsonProperty("ProductPrice")
    private BigDecimal price;
    @JsonProperty("DateOfExpiry")
    @JsonFormat(
            pattern = "yyyy-MM-dd")
    private Date expiryDate;
    @JsonProperty("DateOfProduction")
    @JsonFormat(
            pattern = "yyyy-MM-dd@HH:mm:ss")
    private Date productionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
