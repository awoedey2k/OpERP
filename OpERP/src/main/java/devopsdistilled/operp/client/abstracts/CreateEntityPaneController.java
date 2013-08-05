package devopsdistilled.operp.client.abstracts;

import devopsdistilled.operp.client.items.exceptions.EntityNameExistsException;
import devopsdistilled.operp.client.items.exceptions.NullFieldException;
import devopsdistilled.operp.server.data.entity.Entiti;

public interface CreateEntityPaneController<E extends Entiti<?>> extends
		SubTaskPaneController {

	public void validate(E entity) throws NullFieldException,
			EntityNameExistsException;

	public E save(E entity);

}