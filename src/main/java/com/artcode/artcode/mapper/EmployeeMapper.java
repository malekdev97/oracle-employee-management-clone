package com.artcode.artcode.mapper;

import com.artcode.artcode.dto.EmployeeRequest;
import com.artcode.artcode.dto.EmployeeResponse;
import com.artcode.artcode.models.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee toEntity(EmployeeRequest request);

    EmployeeResponse toResponse(Employee employee);
}
