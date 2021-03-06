/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.outlookservices;

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type Physical Address.
*/
public class PhysicalAddress extends ODataBaseEntity {

    public PhysicalAddress(){
        setODataType("#Microsoft.OutlookServices.PhysicalAddress");
    }

    private String Street;

    /**
    * Gets the Street.
    *
    * @return the String
    */
    public String getStreet() {
        return this.Street; 
    }

    /**
    * Sets the Street.
    *
    * @param value the String
    */
    public void setStreet(String value) { 
        this.Street = value;
        valueChanged("Street", value);

    }

    private String City;

    /**
    * Gets the City.
    *
    * @return the String
    */
    public String getCity() {
        return this.City; 
    }

    /**
    * Sets the City.
    *
    * @param value the String
    */
    public void setCity(String value) { 
        this.City = value;
        valueChanged("City", value);

    }

    private String State;

    /**
    * Gets the State.
    *
    * @return the String
    */
    public String getState() {
        return this.State; 
    }

    /**
    * Sets the State.
    *
    * @param value the String
    */
    public void setState(String value) { 
        this.State = value;
        valueChanged("State", value);

    }

    private String CountryOrRegion;

    /**
    * Gets the Country Or Region.
    *
    * @return the String
    */
    public String getCountryOrRegion() {
        return this.CountryOrRegion; 
    }

    /**
    * Sets the Country Or Region.
    *
    * @param value the String
    */
    public void setCountryOrRegion(String value) { 
        this.CountryOrRegion = value;
        valueChanged("CountryOrRegion", value);

    }

    private String PostalCode;

    /**
    * Gets the Postal Code.
    *
    * @return the String
    */
    public String getPostalCode() {
        return this.PostalCode; 
    }

    /**
    * Sets the Postal Code.
    *
    * @param value the String
    */
    public void setPostalCode(String value) { 
        this.PostalCode = value;
        valueChanged("PostalCode", value);

    }
}
