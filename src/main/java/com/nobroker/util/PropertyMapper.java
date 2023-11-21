package com.nobroker.util;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.nobroker.entity.Property;
import com.nobroker.payload.PropertyDTO;

@Mapper(componentModel="spring")
public interface PropertyMapper {

  PropertyDTO propertyEntityToDTO(Property property );

  @Mapping(target="id",ignore=true)
    Property propertyDtoEntity(PropertyDTO propertyDTO);
}