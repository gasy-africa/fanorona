# Move Generator - General Scenario

myPieces   : --------------

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|

myOpponentPieces   : --------------

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|0 | 0 | true | 10 |

:round_pushpin: pulling bits out of Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|1 | 0 | true | 1 |

:round_pushpin: pulling bits out of Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| :1st_place_medal:| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|2 | 0 | true | 11 |

:round_pushpin: pulling bits out of Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| :1st_place_medal:| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| :1st_place_medal:| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| :1st_place_medal:| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :two: |0| 0| 0| :1st_place_medal:| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|3 | 0 | true | 9 |

:round_pushpin: pulling bits out of Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| :1st_place_medal:| 0| 0|
| :four: |0| 0| 0| 0| 0| :1st_place_medal:| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| :1st_place_medal:| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|5 | 1 | true | 1 |

:round_pushpin: pulling bits out of Set 

|`~`     |a| b| c| d| e| f| g| h| i|
|--------|-|--|--|--|--|--|--|--|--|
| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
