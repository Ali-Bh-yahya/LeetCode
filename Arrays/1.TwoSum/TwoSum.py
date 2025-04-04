##  The Link : https://leetcode.com/problems/two-sum/description/  ##

# 1. Two Sum

def TwoSum(nums , target):
  
  targets = [1] * 2
  for i in range(len(nums)):
    for j in range(i+1,len(nums)):
      if nums[i] + nums[j] == target:
        targets[0] = i
        targets[1] = j
        return targets
  return targets 

nums = [2, 7, 11, 15]

target = 9

print(TwoSum(nums , target))#  Output: [0, 1]
#  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
#  What i did :
# 1. Try all pairs using two loops .
# 2.time complexity is O(n^2).
# 3. space complexity is O(1).

# the second solution is using hash map:

def TwoSumPart2(nums,target):
  hash_map = {}
  for num in range(len(nums)):
    complement = target - nums[num]
    if complement in hash_map:
      return [hash_map[complement], num]
    hash_map[nums[num]] = num
  return None

print(TwoSumPart2(nums, target))#  Output: [0, 1]

# how it's working :
# the first iteration of the for loop will :
#  num = 0 , nums[num] = 2 , complement = 9 - 2 = 7
# it will check if the complement is in the hash_map , but it's not there so it will add the current number to the hash_map.
#  hash_map = {2: 0}
# the second iteration of the for loop will :
#  num = 1 , nums[num] = 7 , complement = 9 - 7 = 2
# it will check if the complement is in the hash_map , and it's there so it will return the indexes of the two numbers.

# another example

nums = [3, 2, 4]
target = 6

print(TwoSumPart2(nums, target))#  Output: [1, 2]

# what i did in the second solution:
# 1. I used a hash_map to store the numbers and their indexes.
# 2. I used one loop to iterate through the numbers.
# 3. I calculated the complement of the current number and checked if it's in the hash_map.
# 4. If it's there, I returned the indexes of the two numbers.
# 5. If it's not there, I added the current number to the hash_map.
# 6. time complexity is O(n).
# 7. space complexity is O(n).


  
      
    