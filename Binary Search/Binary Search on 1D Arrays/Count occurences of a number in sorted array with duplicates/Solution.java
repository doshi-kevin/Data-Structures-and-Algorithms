class Solution {
    int countFreq(int[] arr, int target) {
        int firstIndex = findFirstOccurrence(arr, target);
        int lastIndex = findLastOccurrence(arr, target);

        // If the target is not found in the array
        if (firstIndex == -1 || lastIndex == -1) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    int findFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, firstIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                end = mid - 1;  // Move left to find the first occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstIndex;
    }

    int findLastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, lastIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;
                start = mid + 1;  // Move right to find the last occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIndex;
    }
}
