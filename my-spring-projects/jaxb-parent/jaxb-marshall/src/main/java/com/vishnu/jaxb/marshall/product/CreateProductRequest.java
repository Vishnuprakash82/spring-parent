
package com.vishnu.jaxb.marshall.product;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateProductRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateProductRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Product"&gt;
 *       &lt;attribute name="apikey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateProductRequest")
public class CreateProductRequest
    extends Product
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "apikey")
    protected String apikey;

    /**
     * Gets the value of the apikey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApikey() {
        return apikey;
    }

    /**
     * Sets the value of the apikey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApikey(String value) {
        this.apikey = value;
    }

}
