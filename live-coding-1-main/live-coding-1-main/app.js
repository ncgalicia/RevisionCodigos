// Escribe tu código aquí.
function bigWords(string, array) {
    var result = [];
    for (var i = 0; i < array.length; i++) {
      if (array[i].length > string.length) {
        result.push(array[i]);
      }
    }
    return result;
  }
  
  const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
  bigWords('bocina', myArray)
  console.log( bigWords('bocina', myArray)); 