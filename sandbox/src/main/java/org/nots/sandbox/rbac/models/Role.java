/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nots.sandbox.rbac.models;

import lombok.*;
import java.util.Set;
import javax.persistence.*;

/**
 * @author notsumitsuru
 */
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Role {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long roleId;
    
    @NonNull
    @Getter
    @Setter
    private String name;
    
    @Getter
    @Setter
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "ROLE_PARMISSION")
    private Set<Permission> permissions;
    
    
}
