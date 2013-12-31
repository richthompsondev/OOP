from tqdm import tqdm #pip install tqdm
import time

def complicated_function():
    time.sleep(2) #Simulating some complicated processing

for i in tqdm(range(100)):
    complicated_function()