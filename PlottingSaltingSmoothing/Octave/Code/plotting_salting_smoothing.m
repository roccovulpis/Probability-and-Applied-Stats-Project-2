% References
% Creating multiple plot windows.
% https://docs.octave.org/v4.4.0/Multiple-Plot-Windows.html
% Setting the size and positions of plot windows.
% https://lists.gnu.org/archive/html/help-octave/2009-08/msg00184.html
% Generate random numbers.
% https://docs.octave.org/v6.4.0/Random-Number-Generation.html
% Conditional statements in Octave.
% https://docs.octave.org/latest/The-if-Statement.html
% Calculating the moving average over a sliding window.
% https://docs.octave.org/v6.3.0/Statistics-on-Sliding-Windows-of-Data.html
% Linearspace
% https://octave.sourceforge.io/octave/function/linspace.html
% https://www.quora.com/How-does-Octaves-linspace-function-work-internally

% Plotting the function y = mx + b with a slope value of 2 from x = -100 to x = 100.
b = 0;
m = 2;
xBeginning = -100;
xEnd = 100;
numberOfPoints = 50;
x = linspace(xBeginning, xEnd, numberOfPoints);
y = m * x + b;

figure(1,"position", [5,400,550,500]);
plot(x, y, ".r");
title("Graph of Function");
xlabel("x");
ylabel("y");
grid on;

% Salting and plotting the function.
for i = 1:length(x)
    adjust = randi(150);
    if randi([0, 1]) == 0
        y(i) += adjust;
    else
        y(i) -= adjust;
    end
end

figure(2,"position", [550,400,550,500]);
plot(x, y, ".g");
title(" Salted Graph of Function");
xlabel("x");
ylabel("y");
grid on;

% Smoothing and plotting the previously salted function with a window value of 30.
windowValue = 30;
average = movmean(y, windowValue);

figure(3,"position", [1100,400,550,500]);
plot(x, average, ".b");
title("Smoothed Graph of Function");
xlabel("x");
ylabel("y");
grid on;



