package br.com.softblue.bluefood.domain.cliente;

import br.com.softblue.bluefood.domain.usuario.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Cliente extends Usuario {

    private String cpf;

    private String cep;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return getId() != null && Objects.equals(getId(), cliente.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
