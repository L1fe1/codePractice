package algorithm.recursionandloop;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class JumpNthFloor {
    public int JumpFloor(int target) {
        int count = 0;
        int jump1 = 1;
        int jump2 = 2;
        if (target <= 0)
            return 0;
        if (target == 1)
            return 1;
        if (target == 2)
            return 2;
        for(int i = 2; i < target; i++){
            count = jump1+ jump2;
            jump1 = jump2;
            jump2 = count;
        }
        return count;
    }
}
