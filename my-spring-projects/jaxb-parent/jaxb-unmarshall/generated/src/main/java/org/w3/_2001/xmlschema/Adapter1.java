
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.DateTime;

public class Adapter1
    extends XmlAdapter<String, DateTime>
{


    public DateTime unmarshal(String value) {
        return (com.vishnu.jaxb.unmarshall.bindings.utils.DateAdapter.unmarshallDateTime(value));
    }

    public String marshal(DateTime value) {
        return (com.vishnu.jaxb.unmarshall.bindings.utils.DateAdapter.marshallDateTime(value));
    }

}
