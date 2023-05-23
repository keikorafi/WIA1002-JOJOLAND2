package application;

import java.util.*;

public class StandComparator {

    private int compareStandParameter(String param1, String param2) {
        int value1 = getStandParameterValue(param1);
        int value2 = getStandParameterValue(param2);

        return Integer.compare(value1, value2);
    }

    private int getStandParameterValue(String parameter) {
        if (parameter == null) {
            return 1; // Null has the lowest value
        } else if (parameter.equals("?")) {
            return 2;
        } else if (parameter.equals("E")) {
            return 3;
        } else if (parameter.equals("D")) {
            return 4;
        } else if (parameter.equals("C")) {
            return 5;
        } else if (parameter.equals("B")) {
            return 6;
        } else if (parameter.equals("A")) {
            return 7;
        } else if (parameter.equals("Infinity")) {
            return 8;
        } else {
            return 0; // Unknown parameter
        }
    }
    
    public void sorting(ArrayList<stand> StandsList, int[] order) {
    	
    	for (int i = 0; i < StandsList.size() + 1; i++) {
    			stand stand1 = StandsList.get(i);
    		for (int j = i + 1; j < StandsList.size() + 1; i++) {
    			stand stand2 = StandsList.get(j);
    			for (int b = 0; b < order.length; b++) {
        			if(order[b] == 0) {
        				int result = compareStandParameter(stand1.getDestructivePower(), stand2.getDestructivePower());
        		        if (result != 0) {
        		        	if (result < 0) {
        		        		StandsList.set(i, stand2);
        		        		StandsList.set(j, stand1);
        		        	}
        		            break;
        		        }
        			}
        			if(order[b] == 1) {
        				int result = compareStandParameter(stand1.getSpeed(), stand2.getSpeed());
        		        if (result != 0) {
        		        	if (result < 0) {
        		        		StandsList.set(i, stand2);
        		        		StandsList.set(j, stand1);
        		        	}
        		            break;
        		        }
        			}
        			if(order[b] == 2) {
        				int result = compareStandParameter(stand1.getRange(), stand2.getRange());
        		        if (result != 0) {
        		        	if (result < 0) {
        		        		StandsList.set(i, stand2);
        		        		StandsList.set(j, stand1);
        		        	}
        		            break;
        		        }
        			}
        			if(order[b] == 3) {
        				int result = compareStandParameter(stand1.getStamina(), stand2.getStamina());
        		        if (result != 0) {
        		        	if (result < 0) {
        		        		StandsList.set(i, stand2);
        		        		StandsList.set(j, stand1);
        		        	}
        		            break;
        		        }
        			}
        			if(order[b] == 4) {
        				int result = compareStandParameter(stand1.getPrecision(), stand2.getPrecision());
        				if (result != 0) {
        		        	if (result < 0) {
        		        		StandsList.set(i, stand2);
        		        		StandsList.set(j, stand1);
        		        	}
        		            break;
        		        }
        			}
        			if(order[b] == 5) {
        				int result = compareStandParameter(stand1.getDevelopmentPotential(), stand2.getDevelopmentPotential());
        				if (result != 0) {
        		        	if (result < 0) {
        		        		StandsList.set(i, stand2);
        		        		StandsList.set(j, stand1);
        		        	}
        		            break;
        		        }
        			}

        		}
    		}
		}
    	
    }
    
    public void sort() {
    	String[] toSort = {"Destructive Power", "Speed", "Range", "Stamina", "Precision", "Development Potential"}; 
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter the sorting order: ");
    	String order = scanner.nextLine();
    	String[] orders = order.split(";");
    	//to do:
    	//change order from string to integer according to toSort string (Element of). (.equalsToIgnoreCase)
    	//implement descending (.contains)
    	//get only the stands needed in the area
    	//actually sort them
    }
}
