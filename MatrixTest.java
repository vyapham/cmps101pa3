//-----------------------------------------------------------------------------
//  MatrixTest.java
//  A test client for the Matrix ADT
//  
//  Name: Vy Pham
//  CruzID: vyapham
//  Assignment name: pa3
//  Student ID #: 1593394
//-----------------------------------------------------------------------------

public class MatrixTest{
    public static void main(String[] args){
	int i, j, n=1000;
	Matrix A = new Matrix(n);
	Matrix B = new Matrix(n);

	A.changeEntry(1,1,1); B.changeEntry(1,1,1);
	A.changeEntry(1,2,2); B.changeEntry(1,2,0);
	A.changeEntry(1,3,3); B.changeEntry(1,3,1);
	A.changeEntry(2,2,5); B.changeEntry(2,1,1);
	A.changeEntry(2,1,4); B.changeEntry(2,2,1);
	A.changeEntry(2,3,6); B.changeEntry(2,3,0);
	A.changeEntry(3,1,7); B.changeEntry(3,1,1);
	A.changeEntry(3,2,8); B.changeEntry(3,2,1);
	A.changeEntry(3,3,9); B.changeEntry(3,3,1);

	System.out.println(A.getNNZ());
	System.out.println(A);

	Matrix C = new Matrix(n);
	C = A.transpose();
	System.out.println(C);
	
	System.out.println(B.getNNZ());
	System.out.println(B);
	
	Matrix D = new Matrix(n);
	D = B.scalarMult(2.5);
	System.out.println(D);
	
	Matrix E = A.add(B);
	System.out.println(E);
	
	Matrix F = A.sub(B);
	System.out.println(F);

	Matrix G = A.mult(C);
	System.out.println(G);
	
	Matrix H = C.mult(F);
	System.out.println(H);

	Matrix I = C.transpose();
	System.out.println(I);
	System.out.println(I.equals(A));

	A.makeZero();
	System.out.println(A);


	//for (int a = 0; a < C.getSize(); a++) {
	    //System.out.println(C.dot(C.matrix[a], C.matrix[a]));
	    //}
	//Matrix C = A.scalarMult(1.5);
	//System.out.println(C.getNNZ());
	//System.out.println(C);

	//Matrix D = A.add(A);
	//System.out.println(D.getNNZ());
	//System.out.println(D);

	//Matrix E = A.sub(B);
	//System.out.println(E.getNNZ());
	//System.out.println(E);
	/**
	Matrix F = A.sub(C);
	System.out.println(F.getNNZ());
	System.out.println(F);

	System.out.println(A);
	Matrix G = A.transpose();
	System.out.println(G.getNNZ());
	System.out.println(G);
	
	Matrix H = B.transpose();
	System.out.println(H.getNNZ());
	System.out.println(H);

	Matrix I = A.mult(A);
	System.out.println(I.getNNZ());
	System.out.println(I);
	Matrix J = A.copy();
	System.out.println(J.getNNZ());
	System.out.println(J);
	System.out.println(A.equals(J));
	System.out.println(A.equals(B));
	System.out.println(A.equals(A));

	A.makeZero();
	System.out.println(A.getNNZ());
	System.out.println(A);
	**/
    }
}
