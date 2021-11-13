# Move Generator - General Scenario


 myPieces   : --------------

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myOpponentPieces   : --------------

| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|0 | 0 | true | 10 |

:round_pushpin: pulling bits out of Set 

| :five: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myPieces   : --------------

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myOpponentPieces   : --------------

| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|1 | 0 | true | 1 |

:round_pushpin: pulling bits out of Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myPieces   : --------------

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myOpponentPieces   : --------------

| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| :1st_place_medal:| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|2 | 0 | true | 11 |

:round_pushpin: pulling bits out of Set 

| :five: |0| 0| :1st_place_medal:| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| :1st_place_medal:| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| :1st_place_medal:| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myPieces   : --------------

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myOpponentPieces   : --------------

| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :two: |0| 0| 0| :1st_place_medal:| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|3 | 0 | true | 9 |

:round_pushpin: pulling bits out of Set 

| :five: |0| 0| 0| 0| 0| 0| :1st_place_medal:| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| :1st_place_medal:| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| :1st_place_medal:| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myPieces   : --------------

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myOpponentPieces   : --------------

| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

### :bulb: finding Next Element 


:round_pushpin: Working on Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| 0| :1st_place_medal:| 0| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|



| moveSetIndex | type | capt? | shift |
|--------------|------|-------|-------|
|5 | 1 | true | 1 |

:round_pushpin: pulling bits out of Set 

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| 0| 0| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| 0| 0| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myPieces   : --------------

| :five: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|:three: |0| :1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:|
|  :two: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|  :one: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 myOpponentPieces   : --------------

| :five: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|--------|-|--|--|--|--|--|--|--|--|
| :four: |:1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:| :1st_place_medal:|
|:three: |:1st_place_medal:| 0| :1st_place_medal:| 0| 0| :1st_place_medal:| 0| :1st_place_medal:| 0|
|  :two: |0| 0| 0| 0| 0| 0| 0| 0| 0|
|  :one: |0| 0| 0| 0| 0| 0| 0| 0| 0|
| :ice_cube:     |`A`| `B`| `C`| `D`| `E`| `F`| `G`| `H`| `I`|

 :+1: Total Number of Moves : 5
