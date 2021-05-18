#sample output

./gc-prealloc-out 
Allocating 10000000 with GC_INITIAL_HEAP_SIZE=null TestAlloc objects takes: 255 millis.

export GC_INITIAL_HEAP_SIZE=700M

./gc-prealloc-out

Allocating 10000000 with GC_INITIAL_HEAP_SIZE=700M TestAlloc objects takes: 107 millis.
