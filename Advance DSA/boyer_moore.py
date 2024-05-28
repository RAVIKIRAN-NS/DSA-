def bad_character_heuristic(pattern):
    bad_char = [-1] * 256  # Assuming ASCII character set
    for i in range(len(pattern)):
        bad_char[ord(pattern[i])] = i
    return bad_char

def boyer_moore_search(text, pattern):
    m = len(pattern)
    n = len(text)
    bad_char = bad_character_heuristic(pattern)
    s = 0  # s is the shift of the pattern with respect to text
    matches = []

    while s <= n - m:
        j = m - 1

        while j >= 0 and pattern[j] == text[s + j]:
            j -= 1

        if j < 0:
            matches.append(s)
            s += (m - bad_char[ord(text[s + m])] if s + m < n else 1)
        else:
            s += max(1, j - bad_char[ord(text[s + j])])

    return matches

def find_and_replace(text, pattern, replacement):
    matches = boyer_moore_search(text, pattern)
    if not matches:
        return text, matches  # No matches found

    new_text = []
    last_index = 0
    for match in matches:
        new_text.append(text[last_index:match])
        new_text.append(replacement)
        last_index = match + len(pattern)
    new_text.append(text[last_index:])

    return ''.join(new_text), matches

# Example usage
text = "ABAAABCDBBABCDDEBCABC"
pattern = "ABC"
replacement = "XYZ"

print("Original Text:", text)
print("Pattern:", pattern)
print("Replacement:", replacement)

new_text, matches = find_and_replace(text, pattern, replacement)

print("New Text:", new_text)
print("Pattern found at indices:", matches)
