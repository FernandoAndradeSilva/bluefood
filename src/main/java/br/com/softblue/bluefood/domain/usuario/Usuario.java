package br.com.softblue.bluefood.domain.usuario;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@MappedSuperclass
public class Usuario implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;

    private String nome;

    private String email;

    private String telefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Usuario usuario = (Usuario) o;
        return id != null && Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
