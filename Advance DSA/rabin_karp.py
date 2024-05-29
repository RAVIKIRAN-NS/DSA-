import time

def naive_str(text,pattern):
    n = len(text)
    m = len(pattern)
    for i in range(n-m+1):
        j = 0
        while j < m and text[i+j] == pattern[j]:
            j += 1
        if j == m:
            return i
    return -1

def rabin_karp(text,pattern):
    n = len(text)
    m = len(pattern)
    if n < m:
        return -1
    d = 256
    q = 101
    h = pow(d,m-1)%q
    p = 0
    t = 0
    for i in range(m):
        p = (d*p + ord(pattern[i])) %q
        t = (d*t + ord(text[i])) %q
    for i in range(n-m+1):
        if p == t:
            j = 0
            while j < m and text[i+j] == pattern[j]:
                j += 1
            if j == m:
                return i
        if i < n-m:
            t = (d*(t - ord(text[i])*h) + ord(text[i + m])) % q
            t = (t+q)%q



text_ = "ababaababaababa"
pattern_ = "baba"
print(text_)
print(pattern_)

start_time = time.time()
naive_index = naive_str(text_,pattern_)
naive_time = time.time() - start_time
print(f"Patter found using Naive_str: {naive_index}, Naive-time : {naive_time}")

start_time = time.time()
rk_index = rabin_karp(text_,pattern_)
rk_time = time.time() - start_time
print(f"Patter found using Naive_str: {rk_index},rk-time : {rk_time}")

if naive_time < rk_time:
    print("Rabin-karp give faster approach.")
else:
    print("Naive has faster approach.")

