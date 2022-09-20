package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

//		int a[][] = { { 5, 4, 3, 2, 1 }, { 8, 4, 5, 1, 6 }, { 4, 8, 7, 5, 1 }, { 1, 2, 3, 4, 5 } };

// 冒泡排序
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				for(int k=0;k<a[i].length-j-1;k++) {
//					if(a[i][k+1]<a[i][k]) {
//						int tmp=a[i][k];
//						a[i][k]=a[i][k+1];
//						a[i][k+1]=tmp;
//					}
//				}
//			}
//		}

// 选择排序
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				for(int k=j+1;k<a[i].length;k++) {
//					if(a[i][k]<a[i][j]) {
//						int tmp=a[i][k];
//						a[i][k]=a[i][j];
//						a[i][j]=tmp;
//					}
//				}
//			}
//		}

// 插入排序
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 1; j < a[i].length; j++) {
//				int tmp = a[i][j];
//				int k;
//				for (k = j - 1; k >= 0; k--) {
//					if (a[i][k] > tmp)
//						a[i][k + 1] = a[i][k];
//					else
//						break;
//				}
//				a[i][k + 1] = tmp;
//			}
//		}

//		for (int i = 0; i < a.length; i++) {
//			System.out.print("{");
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + ",");
//			}
//			System.out.println("}");
//		}

//TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int n, L, S;
//		n = scan.nextInt();
//		L = scan.nextInt();
//		S = scan.nextInt();
//		int A[][] = new int[n][2];
//		int B[][] = new int[S + 1][S + 1];
//		for (int i = 0; i < n; i++) {
//			A[i][0] = scan.nextInt();
//			A[i][1] = scan.nextInt();
//		}
//		int sum = 0;
//		for (int i = S; i >= 0; i--) {
//			for (int j = 0; j <= S; j++) {
//				B[i][j] = scan.nextInt();
//				if (B[i][j] == 1) {
//					sum++;
//				}
//			}
//		}
//
//		int ans = 0;
//		for (int i = 0; i < n; i++) {
//			boolean flag = true;
//			int sum1 = 0;
//			for (int x = 0; x < n; x++) {
//				if (A[x][0] >= A[i][0] && A[x][1] >= A[i][1] && A[x][0] - A[i][0] <= S && A[x][1] - A[i][1] <= S) {
//					sum1++;
//				}
//			}
//			if (sum1 == sum) {
//				for (int j = 0; j < S + 1; j++) {
//					for (int k = 0; k < S + 1; k++) {
//						if (j + A[i][0] > L || k + A[i][1] > L) {
//							flag = false;
//							break;
//						}
//						if (B[j][k] == 0) {
//							for (int l = 0; l < n; l++) {
//								if (A[l][0] == A[i][0] + j && A[l][1] == A[i][1] + k) {
//									flag = false;
//									break;
//								}
//							}
//						} else if (B[j][k] == 1) {
//							for (int m = 0; m < n; m++) {
//								if (A[m][0] == A[i][0] + j && A[m][1] == A[i][1] + k) {
//									break;
//								}
//								if (m == n - 1) {
//									flag = false;
//								}
//							}
//						}
//					}
//				}
//				if (flag == true) {
//					ans++;
//				}
//			}
//		}
//		System.out.println(ans);
//	}

//CSP认证 角色授权
//class role {
//	String name;
//	String operaList[];
//	String resoType[];
//	String resoName[];
//
//	public role() {
//		super();
//	}
//
//	public role(String name, String[] operaList, String[] resoType, String[] resoName) {
//		super();
//		this.name = name;
//		this.operaList = operaList;
//		this.resoType = resoType;
//		this.resoName = resoName;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String[] getOperaList() {
//		return operaList;
//	}
//
//	public void setOperaList(String[] operaList) {
//		this.operaList = operaList;
//	}
//
//	public String[] getResoType() {
//		return resoType;
//	}
//
//	public void setResoType(String[] resoType) {
//		this.resoType = resoType;
//	}
//
//	public String[] getResoName() {
//		return resoName;
//	}
//
//	public void setResoName(String[] resoName) {
//		this.resoName = resoName;
//	}
//}
//
//class roleAsso {
//	String name;
//	String authorList[];
//
//	public roleAsso() {
//		super();
//	}
//
//	public roleAsso(String name, String[] authorList) {
//		super();
//		this.name = name;
//		this.authorList = authorList;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String[] getAuthorList() {
//		return authorList;
//	}
//
//	public void setAuthorList(String[] authorList) {
//		this.authorList = authorList;
//	}
//
//	@Override
//	public String toString() {
//		return "roleAsso [name=" + name + ", authorList=" + Arrays.toString(authorList) + "]";
//	}
//
//}
//
//public class Main {
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int n, m, q;
//		n = scan.nextInt();
//		m = scan.nextInt();
//		q = scan.nextInt();
//
//		role roleList[] = new role[500];
//		roleAsso roleAssoList[] = new roleAsso[500];
//		int num1 = 0;
//		int num2 = 0;
//
//		for (int i = 0; i < n; i++) {
//			// 姓名
//			String name = "";
//			name = scan.next();
//			// 操作清单
//			int nv;
//			nv = scan.nextInt();
//			String operaList[] = new String[nv];
//			for (int j = 0; j < nv; j++) {
//				operaList[j] = scan.next();
//			}
//			// 资源种类清单
//			int no;
//			no = scan.nextInt();
//			String resoType[] = new String[no];
//			for (int j = 0; j < no; j++) {
//				resoType[j] = scan.next();
//			}
//			// 资源名称清单
//			int nn;
//			nn = scan.nextInt();
//			String resoName[] = new String[500];
//			if (nn == 0) {
//				Arrays.fill(resoName, "*");
//			}
//			for (int j = 0; j < nn; j++) {
//				resoName[j] = scan.next();
//			}
//			// 添加角色
//			role r = new role(name, operaList, resoType, resoName);
//			roleList[num1++] = r;
//
//		}
//
//		for (int i = 0; i < m; i++) {
//			// 角色名称
//			String roleName;
//			roleName = scan.next();
//			// 授权对象清单
//			int ns;
//			ns = scan.nextInt();
//			String authorList[] = new String[ns * 2];
//			for (int j = 0; j < ns * 2; j++) {
//				authorList[j] = scan.next();
//			}
//			// 添加角色关联
//			roleAsso r = new roleAsso(roleName, authorList);
//			roleAssoList[num2++] = r;
//		}
//
//		int a[] = new int[q];
//		int b = 0;
//		for (int i = 0; i < q; i++) {
//			// 用户名称
//			String userName;
//			userName = scan.next();
//			// 用户组
//			int ng;
//			ng = scan.nextInt();
//			String userGroup[] = new String[ng];
//			for (int j = 0; j < ng; j++) {
//				userGroup[j] = scan.next();
//			}
//
//			String operaName;
//			String resoType;
//			String resoName;
//			operaName = scan.next();
//			resoType = scan.next();
//			resoName = scan.next();
//			
//			// 判断
//			String roleNameList[] = new String[500];
//			int num3 = 0;
//			for (int j = 0; j < roleAssoList.length; j++) {
//				if (roleAssoList[j] != null) {
//					for (int k = 0; k < roleAssoList[j].authorList.length; k += 2) {
//						if (roleAssoList[j].authorList[k].equals("u")) {
//							if (roleAssoList[j].authorList[k + 1].equals(userName))
//								roleNameList[num3++] = roleAssoList[j].name;
//						} else if (roleAssoList[j].authorList[k].equals("g")) {
//							for (int l = 0; l < userGroup.length; l++) {
//								if (userGroup[l].equals(roleAssoList[j].authorList[k + 1])) {
//									roleNameList[num3++] = roleAssoList[j].name;
//								}
//							}
//						}
//					}
//				}
//			}
//
//			for (int j = 0; j < roleNameList.length; j++) {
//				for (int k = 0; k < roleList.length; k++) {
//					if (roleList[k] != null && roleNameList[j] != null) {
//						if (roleNameList[j].equals(roleList[k].name)) {
//							boolean flag1 = false;
//							boolean flag2 = false;
//							boolean flag3 = false;
//							String list1[] = roleList[k].operaList;
//							String list2[] = roleList[k].resoType;
//							String list3[] = roleList[k].resoName;
//
//							for (int l = 0; l < list1.length; l++) {
//								if (list1[l].equals(operaName) || list1[l].equals("*")) {
//									flag1 = true;
//									break;
//								}
//							}
//							if (flag1 == true) {
//								for (int l = 0; l < list2.length; l++) {
//									if (list2[l].equals(resoType) || list2[l].equals("*")) {
//										flag2 = true;
//										break;
//									}
//								}
//							}
//							if (flag2 == true) {
//								for (int l = 0; l < list3.length; l++) {
//									if (list3[l].equals(resoName) || list3[l].equals("*")) {
//										flag3 = true;
//										break;
//									}
//								}
//							}
//							if (flag3 == true) {
//								a[b++] = 1;
//								break;
//							} else {
//								a[b++] = 0;
//								break;
//							}
//						}
//					}
//				}
//			}
//		}
//		for (int i = 0; i < q; i++) {
//			System.out.println(a[i]);
//		}
//	}
//}

///     稀疏向量（哈希表）
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//class Reader {
//    static StringTokenizer token =new StringTokenizer("");
//    static BufferedReader reader   =new BufferedReader (new InputStreamReader(System.in)) ;
//    static String nextLine() throws IOException {
//        return reader.readLine() ;
//    }
//    static  String next() throws IOException {
//        while(!token.hasMoreTokens()) {
//            token =new StringTokenizer(reader.readLine()) ;
//        }
//        return token.nextToken() ;
//    }
// 
//    static int nextInt() throws IOException {
//        return Integer.parseInt(next()) ;
//    }
//    static double nextDouble() throws IOException {
//        return Double.parseDouble(next()) ;
//    }
// 
//}
//public class Main {
//	public static void main(String[] args) throws IOException {
//		int n, a, b, key, value;
//		long sum = 0L;
//		n = Reader.nextInt();
//		a = Reader.nextInt();
//		b = Reader.nextInt();
//		HashMap<Integer, Integer> s = new HashMap<>();
//		for (int i = 0; i < a; i++) {
//			key = Reader.nextInt();
//			value = Reader.nextInt();
//			s.put(key, value);
//		}
//		for (int i = 0; i < b; i++) {
//			key = Reader.nextInt();
//			value = Reader.nextInt();
//			if (s.containsKey(key)) {
//				sum += s.get(key) * value;
//			}
//		}
//		System.out.println(sum);
//	}
//}

//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n, a, b, key, value;
//		long sum = 0L;
//		String str=br.readLine();
//		String[] s=str.trim().split(" ");
//		n=Integer.parseInt(s[0]);
//		a=Integer.parseInt(s[1]);
//		b=Integer.parseInt(s[2]);
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < a; i++) {
//			str=br.readLine();
//			s=str.trim().split(" ");
//			key = Integer.parseInt(s[0]);
//			value = Integer.parseInt(s[1]);
//			map.put(key, value);
//		}
//		for (int i = 0; i < b; i++) {
//			str=br.readLine();
//			s=str.trim().split(" ");
//			key = Integer.parseInt(s[0]);
//			value = Integer.parseInt(s[1]);
//			if (map.containsKey(key)) {
//				sum += map.get(key) * value;
//			}
//		}
//		System.out.println(sum);
//	}
//}

//CSP 风险人群筛查
//public class Main {
//	public static void main(String[] args) throws IOException {
//		int n, k, t, xl, yd, xr, yu;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		String s[] = str.trim().split(" ");
//		n = Integer.parseInt(s[0]);
//		k = Integer.parseInt(s[1]);
//		t = Integer.parseInt(s[2]);
//		xl = Integer.parseInt(s[3]);
//		yd = Integer.parseInt(s[4]);
//		xr = Integer.parseInt(s[5]);
//		yu = Integer.parseInt(s[6]);
//
//		int x, y;
//		int pass = 0;
//		int stay = 0;
//		for (int i = 0; i < n; i++) {
//			str = br.readLine();
//			String s1[] = str.trim().split(" ");
//			int num = 0;
//			boolean boolpass = false;
//			boolean boolstay = false;
//			for (int j = 0; j < 2 * t; j += 2) {
//				x = Integer.parseInt(s1[j]);
//				y = Integer.parseInt(s1[j + 1]);
//				if (x >= xl && x <= xr && y >= yd && y <= yu) {
//					num++;
//					boolpass=true;
//					if(num>=k) {
//						boolstay=true;
//						break;
//					}
//				} else {
//					if (num > 0 && num < k) {
//						boolpass = true;
//					} else if (num >= k) {
//						boolstay = true;
//						break;
//					}
//					num = 0;
//				}
//			}
//			if (boolstay) {
//				stay++;
//				pass++;
//			} else {
//				if (boolpass) {
//					pass++;
//				}
//			}
//		}
//		System.out.println(pass);
//		System.out.println(stay);
//	}
//}

//   期末预测之最佳阈值
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n;
//		n = Integer.parseInt(br.readLine());
//		int m[][] = new int[n][2];
//		HashSet<Integer> set=new HashSet<Integer>();
//		for (int i = 0; i < n; i++) {
//			String str = br.readLine();
//			String[] s = str.trim().split(" ");
//			m[i][0] = Integer.parseInt(s[0]);
//			m[i][1] = Integer.parseInt(s[1]);
//			
//			set.add(m[i][0]);
//		}
//		int sum, max = 0, xitaOfMax = 0;
//
//		for (int i : set) {
//			sum = 0;
//			int xita = i;
//			for (int j = 0; j < n; j++) {
//				int predict = 0;
//				if (m[j][0] >= xita) {
//					predict = 1;
//				}
//				if (m[j][1] == predict) {
//					sum++;
//				}
//			}
//			if (sum > max) {
//				max = sum;
//				xitaOfMax = xita;
//			} else if (sum == max) {
//				if (xita > xitaOfMax) {
//					xitaOfMax = xita;
//				}
//			}
//		}
//		System.out.println(xitaOfMax);
//	}
//}

//public class Main {

//	public static void main(String[] args) throws IOException {
//		int n, L, r, t;
//		Scanner scan = new Scanner(System.in);
//		n = scan.nextInt();
//		L = scan.nextInt();
//		r = scan.nextInt();
//		t = scan.nextInt();
//		int A[][] = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				A[i][j] = scan.nextInt();
//			}
//		}
//
//		int ans = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				int sum = 0, num = 0;
//				double ave = 0;
//				for (int k = 0; k < n; k++) {
//					for (int l = 0; l < n; l++) {
//						if (Math.abs(l - j) <= r && Math.abs(k - i) <= r) {
//							sum += A[k][l];
//							num++;
//						}
//					}
//				}
//				ave = (double) (sum * 1.0 / num);
//				if (ave <= t) {
//					ans++;
//				}
//			}
//		}
//		
//		System.out.println(ans);
//	}
//}

//public class Main {
//	public static void main(String[] args) throws IOException {
//		int maxn = 50;
//		int result[][][] = new int[maxn][maxn][3];
//
//		Scanner scan = new Scanner(System.in);
//		String str;
//		str = scan.nextLine();
//		int n = str.length();
//		// int result[n+1][n+1][3];
//
//		for (int i = 0; i < n; i++)
//			for (int j = 0; j < n; j++)
//				for (int k = 0; k < 3; k++)
//					result[i][j][k] = 0;
//
//		for (int i = 0; i < n; i++)
//			result[i][i][str.charAt(i) - 'a'] = 1;
//
//		for (int k = 1; k < n; k++) { // the length of a pair of brackets from 1 to n - 1
//			for (int i = 0; i < n - k; i++) { // the position of the first bracket
//				int j = i + k;
//				for (int t = i; t < j; t++) { // t is the position of the second bracket from i to j - 1
//					result[i][j][0] += result[i][t][2] * result[t + 1][j][0] // c * a = a
//							+ result[i][t][0] * result[t + 1][j][2] // a * c = a
//							+ result[i][t][1] * result[t + 1][j][2]; // b * c = a
//
//					result[i][j][1] += result[i][t][0] * result[t + 1][j][0] // a * a = b
//							+ result[i][t][0] * result[t + 1][j][1] // a * b = b
//							+ result[i][t][1] * result[t + 1][j][1]; // b * b = b
//
//					result[i][j][2] += result[i][t][1] * result[t + 1][j][0] // b * a = c
//							+ result[i][t][2] * result[t + 1][j][1] // c * b = c
//							+ result[i][t][2] * result[t + 1][j][2]; // c * c = c
//				}
//			}
//		}
//		System.out.println(result[0][n - 1][0]);
//	}
//}

import java.util.*;

public class Main {
	static int[] a;
	static void dfs(int[] a,int m, int k) {
		if(m==k) {
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		}else {
			for(int i=m;i<=k;i++) {
				swap(a,m,i);
				dfs(a,m+1,k);
				swap(a,m,i);
			}
		}
	}
	
	static void swap(int[] a,int i, int j) {
		// TODO Auto-generated method stub
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void main(String[] args) {
		a= new int[3];
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		dfs(a,0,2);
	}
}
