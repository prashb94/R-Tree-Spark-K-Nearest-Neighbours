/*
Created by Prashanth.B 27/07/2016
Tsinghua University Big Data Summer Camp
K Nearest cars using R-Trees
*/
A simple implementation of KNN using R-Trees

To test, use the sample Uber car data provided in my other repo (https://github.com/prashb94/R-Tree-Spark---Find-Car-s-Nearest-Location)


Commands -
1.spark-shell -classpath arch.jar
2.:paste
3.Copy and paste the code inside the main method in HW4.scala, after setting the value of K to whatever is required
4.CTRL+D

Note: Make sure that the file with the vehicle location data is placed on HDFS and called "car.csv"

An R-Tree is used to store each point in the file and this R-Tree is searched using the position of each car to find the K nearest cars. The first value returned is always the point itself, so K+1 nearest neighbours are reported.

/* SAMPLE OUTPUT
.
.
.
.
.
(8729495,ListBuffer(8729495, 6564802, 8611104, 2237794, 7561262, 3485000))
(4292572,ListBuffer(4292572, 2382600, 7159672, 7805637, 4403364, 5375919))
(8729523,ListBuffer(8729523, 3271620, 6007335, 6182447, 5213799, 8468398))
(4292636,ListBuffer(4292636, 7544791, 1973277, 3258562, 4048270, 3801789))
(8729778,ListBuffer(8729778, 6653719, 4329423, 7792783, 5011354, 2659067))
(4292651,ListBuffer(4292651, 7967767, 4330387, 2960384, 2858391, 4321140))
(8729810,ListBuffer(8729810, 7896395, 4852530, 6182533, 925954, 7884651))
(4292732,ListBuffer(4292732, 7454769, 7518187, 5076674, 922960, 1324135))
(8729866,ListBuffer(2405966, 8729866, 6922786, 5288530, 8027371, 8467650))
(4292820,ListBuffer(4292820, 1324187, 7516438, 6796007, 5363791, 4047928))
(8729988,ListBuffer(8729988, 3487268, 2410338, 6569421, 8027361, 5681400))
(4292888,ListBuffer(4292888, 6166931, 6995623, 514062, 5886413, 5168574))
.
.
.
*/
