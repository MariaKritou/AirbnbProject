package net.codejava.dto;

import net.codejava.model.Property;
import lombok.Data;

import java.sql.Date;

@Data
public class PropertyDto {

    private int propertyId;
    private String country;
    private String address;
    private float price;
    private String description;
    private String propertyType;
    private int userId;

    public static Property getProperty(PropertyDto propertyDto) {
        if (propertyDto==null) return null;
        Property property = new Property();
        property.setPropertyId(propertyDto.getPropertyId());
        property.setCountry(propertyDto.getCountry());
        property.setAddress(propertyDto.getAddress());
        property.setPrice(propertyDto.getPrice());
        property.setDescription(propertyDto.getDescription());
        property.setPropertyType(propertyDto.getPropertyType());


        property.setUserId(propertyDto.getUserId());

        return property;
    }

    public static PropertyDto getPropertyDto(Property property){
        if (property==null) return null;
        PropertyDto propertyDto = new PropertyDto();
        propertyDto.setPropertyId(property.getPropertyId());
        propertyDto.setCountry(property.getCountry());
        propertyDto.setAddress(property.getAddress());
        propertyDto.setPrice(property.getPrice());
        propertyDto.setDescription(property.getDescription());
        propertyDto.setPropertyType(property.getPropertyType());

        propertyDto.setUserId(property.getUserId());

        return propertyDto;
    }

}
