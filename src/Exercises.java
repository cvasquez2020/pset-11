import java.util.ArrayList;

public class Exercises {
	 
	public int findMe(int[] list, int target) {
		if (list == null) {
			return -1;
		} 
			
		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}
			
			return -1;
	}

  public int findMe(ArrayList<String> list, String target) {
	  if (list == null) {
			return -1;
	  }
		
	  for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		} 
	   
	  return -1;  
  }

	public int findMeFaster(ArrayList<Integer> list, int target) {
		if (list == null) {
			return -1; 
		}
		
		int lower = 0;
		int mid = 0; 
		int upper = list.size();
		
		
		while  (lower <= upper) {
			mid = (upper + lower) / 2; 

			if (target > list.get(mid)) {
				lower = mid + 1;
			} else if (target < list.get(mid)) {
				upper = mid - 1;
			} else {
				return mid;
			}
		}
	    
		return -1;
	}

	public int findMeFaster(String[] list, String target) {
		if (list == null || target.equals(null)) {
			return -1; 
		}
		
		int lower = 0;
		int upper = list.length;
		int mid = 0;

		while  (lower <= upper) {
			mid = (lower + upper) / 2;
		
			if (0 > list[mid].compareTo(target)) {
				lower = mid + 1;	
			} else if (0 < list[mid].compareTo(target)) {
				upper = mid - 1;
			} else if (list[mid].equals(target)) {
				return mid;
			}
		}
	    
		return -1;
  }

  public int[] bubble(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> bubble(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> insertion(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] insertion(String[] list, boolean ascending) {
    return null;
  }

  public int[] selection(int[] list, boolean ascending) {
    return null;
  }

  public ArrayList<String> selection(ArrayList<String> list, boolean ascending) {
    return null;
  }

  public ArrayList<Integer> merge(ArrayList<Integer> list, boolean ascending) {
    return null;
  }

  public String[] merge(String[] list, boolean ascending) {
    return null;
  }
}