class Solution:
    def reverseVowels(self, s: str) -> str:
        ind = []
        s = list(s)
        ss = ""
        k = 0
        for i in range(len(s)):
            if s[i] in "aeiouAEIOU":
                ind.append(i)
                k = k+1
                ss += s[i]
        k=0
        for i in ss[::-1]:
            s[ind[k]] = i
            k = k+1
        return "".join(s)

        
