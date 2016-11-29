package org.motechproject.dhis2.dto;

import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class DataElementDto {
    private String uuid;
    private String name;

    public DataElementDto() { }

    public DataElementDto(String name, String uuid) {
        this.uuid = uuid;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (!(o instanceof DataElementDto)) {
            return false;
        }

        DataElementDto other = (DataElementDto) o;

        return ObjectUtils.equals(uuid, other.uuid) && ObjectUtils.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uuid).append(name).toHashCode();
    }
}
