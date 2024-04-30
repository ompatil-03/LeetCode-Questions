package HashSets;
import  java.util.*;
import java.util.stream.Collectors;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={2,4,6};
        List<List<Integer>> ans=findDifferenceOriginal(arr1,arr2);
        System.out.println(ans.toString());
    }

    //First Try Solution
    public static List<List<Integer>> findDifferenceOriginal(int[] nums1, int[] nums2) {
        List<List<Integer>> ans= new ArrayList<>();
        HashSet<Integer>h1=new HashSet<>();
        HashSet<Integer>h2=new HashSet<>();
        for(int n:nums1){
            h1.add(n);
        }
        for(int n:nums2){
            h2.add(n);
        }
        List<Integer> ans1=new ArrayList<>();
        Iterator<Integer> iterator = h1.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if(!h2.contains(value)){
                ans1.add(value);
            }
        }
        ans.add(ans1);


        List<Integer> ans2=new ArrayList<>();
        Iterator<Integer> iterator2 = h2.iterator();
        while (iterator2.hasNext()) {
            int value = iterator2.next();
            if(!h1.contains(value)){
                ans2.add(value);
            }

        }
        ans.add(ans2);
        return ans;
    }
    //Optimized Solution From leetCode
        public static List<List<Integer>> findDifferenceOptimized(int[] nums1, int[] nums2) {
            Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
            Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
            List<Integer> answer0 = new ArrayList<>();
            List<Integer> answer1 = new ArrayList<>();
            List<List<Integer>> answer = new ArrayList<>();

            nums1Set.forEach(elem -> {
                if (!nums2Set.contains(elem)) {
                    answer0.add(elem);
                }
            });
            answer.add(answer0);

            nums2Set.forEach(elem -> {
                if (!nums1Set.contains(elem)) {
                    answer1.add(elem);
                }
            });
            answer.add(answer1);

            return answer;
        }

}
