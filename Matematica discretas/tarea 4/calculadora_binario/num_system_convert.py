## Verificar si una cadena de bits solo contiene
## 0 o 1, de no sr asi retornara falso
def check_if_is_bin(binary_string: str) -> bool:
    for bit in binary_string:

        if(bit != '1' and bit != "0"):
            print("WARNING: A character different from 1 and 0 was detected in the bit string!")
            return False
        
    return True

## Convertir de binario a decimal
def bin_to_dec(binary_string : str) -> int:
    total : int = 0
    multipler : int = 1
    
    if(check_if_is_bin(binary_string)): # verificar si solo hay 0 y 1

        bits_len : int = len(binary_string) - 1

        while(bits_len >= 0): # realizar conversion
            if(binary_string[bits_len] == "1"):
                total += multipler

            multipler *= 2
            bits_len -= 1

        return total
    return 0

## Convertir de decimal a binario
def dec_to_bin(number : int) -> str:
    bits : str = ""
    division : int = abs(int(number))
    mod : int = 0

    # Convertir decimal a binario
    while(division > 1):
        mod = division % 2
        division = int(division / 2)

        bits += str(mod)
    bits += str(division)

    bits_string : str = ""
    bit_len = len(bits) - 1

    # Voltear la cadena anterior de bits
    while(bit_len >= 0):
        bits_string += bits[bit_len]

        bit_len -= 1


    return bits_string
