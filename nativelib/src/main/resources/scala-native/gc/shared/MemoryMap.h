#ifndef MEMORYMAP_H
#define MEMORYMAP_H

#include "GCTypes.h"
#include <stddef.h>

word_t *memoryMap(size_t memorySize);

word_t *memoryMapPrealloc(size_t memorySize, size_t doPrealloc);

#endif // MEMORYMAP_H
