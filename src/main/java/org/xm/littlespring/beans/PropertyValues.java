package org.xm.littlespring.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuming
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();
    public PropertyValues(){

    }
    public void addPropertyValue(PropertyValue propertyValue){
        this.propertyValueList.add(propertyValue);
    }
    public List<PropertyValue> getPropertyValueList(){
        return  this.propertyValueList;
    }
}
