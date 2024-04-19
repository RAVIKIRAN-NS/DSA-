package ravi.Binary_search;

public class Smallest_letter_greater_target {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char goal = 'j';
        char ans = nextGreatestLetter(letters,goal);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length-1;

            while (start <= end){
                int mid = start + (end - start) / 2;

                if (target < letters[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
//            return letters[start]; this wont work for last index.
        }
    }


