package hacs;
/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author Rushikesh
 * @version 2.0
 */
abstract public class NodeVisitor {

	public NodeVisitor() {
		System.out.println("Node Visitor Implemented");
	}

	public NodeVisitor(Object visitee) {
		System.out.println("Node Visitor with object " + visitee + " Implemented");
	}

	abstract public void visitFacade(Facade facade);

	abstract public void visitCourse(Course course);

	abstract public void visitAssignment(Assignment assignment);

}