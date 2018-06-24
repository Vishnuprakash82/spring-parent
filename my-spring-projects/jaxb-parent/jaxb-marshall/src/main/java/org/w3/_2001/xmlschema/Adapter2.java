
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalDate;

public class Adapter2
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (com.vishnu.jaxb.marshall.bindings.utils.DateAdapter.unmarshallDate(value));
    }

    public String marshal(LocalDate value) {
        return (com.vishnu.jaxb.marshall.bindings.utils.DateAdapter.marshallDate(value));
    }

}
