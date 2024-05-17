# Here are the data of min clashes

### File: ute-s-92.stu

Courses: 381,

Slots: 17,

Iterations: 1000

| shifts | Min Clashes | Step | 
|--------|-------------|------|
| 1      | 4216        | 80   | 
| 2      | 412         | 23   |
| 3      | 234         | 15   |
| 4      | 176         | 7    |
| 5      | 106         | 159  |
| 6      | 100         | 267  |
| 7      | 92          | 206  |
| 8      | 66          | 555  |
| 9      | 44          | 471  |
| 10     | 70          | 524  |
| 11     | 48          | 539  |
| 12     | 52          | 596  |
| 13     | 42          | 159  |
| 14     | 52          | 216  |
| 15     | 42          | 755  |
| 16     | 34          | 866  |
| 17     | 94          | 1    |
| 18     | 46          | 883  |
| 19     | 48          | 75   |
| 20     | 30          | 594  |
| 21     | 46          | 316  |
| 22     | 30          | 970  |
| 23     | 48          | 904  |
| 24     | 28          | 469  |
| 25     | 38          | 473  |
| 26     | 48          | 185  |
| 27     | 44          | 715  |
| 28     | 54          | 826  |
| 29     | 38          | 114  |
| 30     | 24          | 897  |
| 31     | 22          | 436  |
| 32     | 38          | 969  |
| 33     | 34          | 866  |
| 34     | 94          | 1    |


#
### File tre-s-92.stu:

Courses: 261,

Slots: 20,

Iterations: 1000

| shifts | Min Clashes | Step | 
|--------|-------------|------|
| 1      | 4928        | 51   | 
| 2      | 738         | 30   |
| 3      | 324         | 57   |
| 4      | 332         | 15   |
| 5      | 232         | 13   |
| 6      | 168         | 59   |
| 7      | 172         | 430  |
| 8      | 182         | 27   |
| 9      | 144         | 215  |
| 10     | 188         | 9    |
| 11     | 140         | 186  |
| 12     | 120         | 72   |
| 13     | 122         | 616  |
| 14     | 110         | 92   |
| 15     | 170         | 7    |
| 16     | 122         | 23   |
| 17     | 112         | 641  |
| 18     | 100         | 43   |
| 19     | 116         | 666  |
| 20     | 304         | 1    |
| 21     | 116         | 716  |
| 22     | 76          | 180  |
| 23     | 100         | 341  |
| 24     | 158         | 22   |
| 25     | 156         | 7    |
| 26     | 106         | 67   |
| 27     | 114         | 112  |
| 28     | 144         | 22   |
| 29     | 100         | 833  |
| 30     | 186         | 9    |
| 31     | 108         | 903  |
| 32     | 178         | 19   |
| 33     | 114         | 155  |
| 34     | 90          | 53   |
| 35     | 158         | 21   |
| 36     | 124         | 34   |
| 37     | 108         | 532  |
| 38     | 116         | 34   |
| 39     | 116         | 666  |
| 40     | 304         | 1    |





### Observations




# Hopfield update observations

At the beginning after update of Hopfield Network I randomly chose in which timeslot to insert course. As a result after each update
I got more and more clashes. 
After update I insert the course in the timeslot where I have the least amount of clashes. The least amount of clashes for dataset tre-s-92 
was 28. After training I called update after some iteration update did not change anything, then I do steps to change the overall picture
after some steps when I have not many clashes I call update once more and now I have much better results.

In the file lse-f-91 the best result that I could get without Hopfield network was 22 clashes at step 436. 
After implementing Hopfield network I could get 11, the strategt was simple. After update started to not change anything
I did a step, then started to update the table once more.