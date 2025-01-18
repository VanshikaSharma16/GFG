#User function Template for python3

class Solution:
    def allPairs(self, target, arr1, arr2):
        arr1.sort()
        dict = {}
        for num in arr2:
            dict[num] = dict.get(num, 0) + 1
        result = []
        for num1 in arr1:
            num2 = target - num1
            if num2 in dict:
                for _ in range(dict[num2]):
                    result.append((num1, num2))
        
        result.sort()
        return result


#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while (T > 0):
        x = int(input())
        arr1 = [int(x) for x in input().strip().split()]
        arr2 = [int(x) for x in input().strip().split()]
        ob = Solution()
        answer = ob.allPairs(x, arr1, arr2)
        sz = len(answer)

        if sz == 0:
            print(-1)

        else:

            for i in range(sz):
                if i == sz - 1:
                    print(*answer[i])
                else:
                    print(*answer[i], end=', ')

        T -= 1
        print("~")


if __name__ == "__main__":
    main()

# } Driver Code Ends