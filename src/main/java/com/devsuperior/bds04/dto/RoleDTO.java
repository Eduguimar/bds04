package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.Role;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class RoleDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Campo obrigatório")
    private String authority;

    public RoleDTO() {

    }

    public RoleDTO(Role entity) {
        this.id = entity.getId();
        this.authority = entity.getAuthority();
    }

    public RoleDTO(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
