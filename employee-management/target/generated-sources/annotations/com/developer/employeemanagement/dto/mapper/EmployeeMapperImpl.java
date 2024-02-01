package com.developer.employeemanagement.dto.mapper;

import com.developer.employeemanagement.dto.request.EmployeeRequest;
import com.developer.employeemanagement.dto.response.EmployeeResponse;
import com.developer.employeemanagement.entity.EmployeeEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-02T02:30:52+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240103-0614, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setName( employeeRequest.getName() );
        employeeEntity.setGender( employeeRequest.getGender() );
        employeeEntity.setDateOfBirth( employeeRequest.getDateOfBirth() );
        employeeEntity.setAddress( employeeRequest.getAddress() );

        return employeeEntity;
    }

    @Override
    public EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setId( employeeEntity.getId() );
        employeeResponse.setName( employeeEntity.getName() );
        employeeResponse.setGender( employeeEntity.getGender() );
        employeeResponse.setDateOfBirth( employeeEntity.getDateOfBirth() );
        employeeResponse.setAddress( employeeEntity.getAddress() );

        return employeeResponse;
    }
}
