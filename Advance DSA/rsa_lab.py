import random

def f(x):
    return -x**2

def hill_climbing_task(max_iter=1000, step_size=0.1, x_range=(-10, 10)):
    x = random.uniform(*x_range)
    for _ in range(max_iter):
        # Generate a random neighbor within the step size
        neighbor = x + random.uniform(-step_size, step_size)
        if x_range[0] <= neighbor <= x_range[1] and f(neighbor) > f(x):
            x = neighbor
    return x

best_x = hill_climbing_task()

print("Best solution found:", best_x)


print("Maximum value found:", f(best_x))
