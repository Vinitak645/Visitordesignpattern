package visitors;

import departments.*;

public interface Departmentvisitor {

	int visit(Medi mdd);
	int visit(Arts Add);
	int visit(Busi bdd);
	int visit(Comm cdd);
	int visit(Sci sdd);
}