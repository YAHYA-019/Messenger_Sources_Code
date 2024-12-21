import os
import re

BAD_NAMES = {"temp", "data", "foo", "bar", "thing"}

def is_inappropriate_name(name):

    if len(name) == 1 :
        return True
    
    if len(name) > 30:
        return True
    
    if name in BAD_NAMES:
        return True
    

    if not re.match(r"^[a-zA-Z_][a-zA-Z0-9_]*$", name):
        return True

    return False

def detect_inappropriate_naming(file_path):
    try:
        with open(file_path, "r", encoding="utf-8") as file:  # Specify utf-8 encoding
            lines = file.readlines()
    except UnicodeDecodeError:
        print(f"Skipping file due to encoding issues: {file_path}")
        return []  
    
    results = []
    for line_number, line in enumerate(lines, start=1):
        # Extract variable and function names using a regex
        matches = re.findall(r"\b(?:def|class|var|let|const)?\s*([a-zA-Z_][a-zA-Z0-9_]*)", line)
        for name in matches:
            if is_inappropriate_name(name):
                results.append(f"Inappropriate name '{name}' at line {line_number}")
    return results

def scan_source_code_for_naming_issues(source_dir):
    results = []
    for root, _, files in os.walk(source_dir):
        for file in files:
            if file.endswith((".java")): 
                file_path = os.path.join(root, file)
                issues = detect_inappropriate_naming(file_path)
                if issues:
                    results.append(f"\nIssues in file: {file_path}\n")
                    results.extend(issues)
    return results

# Main 
if __name__ == "__main__":
    source_folder = input("Enter the source code folder path: ").strip()
    if not os.path.isdir(source_folder):
        print("Invalid folder path!")
    else:
        issues = scan_source_code_for_naming_issues(source_folder)
        if issues:
            print("\nCode Smell Report:")
            for issue in issues:
                print(issue)
        else:
            print("No inappropriate naming issues detected.")
