

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] a= {{2,10,5},{3,4,5},{1,0,9}};
		int min=a[0][0];
		int mincol=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(a[i][j]<min) {
					min=a[i][j];
					mincol=j;
				}
			}
		}
		
		System.out.println(min);
		System.out.println(mincol);
		int k=0;
		int max=a[0][mincol];
		while(k<3) {
			if(a[k][mincol]>max) {
				max=a[k][mincol];
			}
			k++;
		}
		System.out.println(max);
	}
}
