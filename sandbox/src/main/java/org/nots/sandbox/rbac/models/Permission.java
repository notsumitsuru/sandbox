/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nots.sandbox.rbac.models;

import java.util.Set;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author Mitsuru Notsu
 */
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Permission {
    
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;
    
    @NonNull
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "permissions", cascade = CascadeType.PERSIST)
    private Set<Role> roles;
}
