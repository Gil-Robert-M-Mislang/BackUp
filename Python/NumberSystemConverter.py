#Number system Converter
class Converter():
    #CONVERTS ANY NUMBER SYSTEM TO DECIMAL
    def decimal(self, kind, given):
        ANSWER = []
        given = str(given)
        given = given[::-1]
        n = 0
        
        
        #FROM BINARY TO DECIMAL
        if kind == 'binary':
            for i in given:
                conv = int(i) * 2**n
                ANSWER += [conv]
                n += 1
            return sum(ANSWER)
            
        #FROM OCTAL TO DECIMAL
        elif kind == 'octal':
            for i in given:
                conv = int(i) * 8**n
                ANSWER += [conv]
                n += 1
            return sum(ANSWER)
        
        #FROM HEXADECIMAL TO DECIMAL
        elif kind == 'hexadecimal':
            for i in given:
                if i.isalpha():
                    string = {'A': 10,'B': 11,'C':12,'D':13,'E':14,'F':15}
                    i = string.get(i)
                conv = int(i) * 16**n
                ANSWER += [conv]
                n += 1
            return sum(ANSWER)
    
    #CONVERTS ANY NUMBER SYSTEM TO BINARY
    def binary(self, kind, given):
        given = int(given)
        carry = 0
        ANSWER = ''
        
        #FROM DECIMAL TO BINARY
        if kind == 'decimal':
            while given != 0:
                carry = given % 2
                given = given // 2
                ANSWER += str(carry)
            return ANSWER[::-1]
        
        #FROM OCTAL TO BINARY
        elif kind == 'octal':
            given = str(given)
            for i in given:
                given = int(i)
                if given == 1:
                    ANSWER += "1"
                else:
                    for j in range(3):
                        carry = given % 2
                        given = given // 2
                        ANSWER += str(carry)
            return ANSWER 
        
        #FROM HEXADECIMAL TO BINARY
        elif kind == 'hexadecimal':
            given = str(given)
            for i in given:
                given = self.decimal('hexadecimal', i)
                if given == 1:
                    ANSWER += "1"
                else:
                    for j in range(4):
                        carry = given % 2
                        given = given // 2
                        ANSWER += str(carry)
            return ANSWER[::-1]
    
    #CONVERTS ANY NUMBER SYSTEM TO OCTAL
    def octal(self, kind, given):
        carry = 0
        ANSWER = ''
        
        #FROM DECIMAL TO OCTAL
        if kind == 'decimal':
            while given != 0:
                carry = given % 8
                given = given // 8
                ANSWER += str(carry)
            ANSWER[::-1]
        
        #FROM BINARY TO OCTAL
        elif kind == 'binary':
            given = str(given)
            x = []
            if len(given)%3 != 0:
                var = len(given)%3
                for i in range(0, var, var):
                    x += [given[i:i + var]]
                    given = given[var:]
            y = [given[k:k+3] for k in range(0, len(given), 3)]
            z = x + y
            for i in z:
                answer = self.decimal('binary',i)
                ANSWER += str(answer)
            ANSWER[::-1]
        
        #FROM HEXADECIMAL TO OCTAL
        elif kind == 'hexadecimal':
            new_given = ''
            given = str(given)
            x = []
            for i in given:
                to_binary = self.binary('hexadecimal',i)
                multiplier = 4 - len(to_binary)
                new_given += '0'*multiplier + to_binary
                
            if len(new_given)%3 != 0:
                var = len(new_given)%3
                for i in range(0, var, var):
                    x += [new_given[i:i + var]]
                    new_given = new_given[var:]
            y = [new_given[k:k+3] for k in range(0, len(new_given), 3)]
            z = x + y
            for i in z:
                answer = self.decimal('binary',i)
                ANSWER += str(answer)
            return ANSWER
            
    #CONVERTS ANY NUMBER SYSTEM TO HEXADECIMAL
    def hexa(self, kind, given):
        carry = 0
        ANSWER = ''
        
        #FROM DECIMAL TO HEXADECIMAL
        if kind == 'decimal':
            while given != 0:
                carry = given % 16
                given = given // 16
                if carry >= 10:
                    string = ['A','B','C','D','E','F']
                    ind = carry - 10
                    ANSWER += string[ind]
                else:
                    ANSWER += str(carry)
            return ANSWER[::-1]
        
        #FROM BINARY TO HEXADECIMAL
        elif kind == 'binary':
            given = str(given)
            x = []
            if len(given)%4 != 0:
                var = len(given)%4
                for i in range(0, var, var):
                    x += [given[i:i + var]]
                    given = given[var:]
            y = [given[k:k+4] for k in range(0, len(given), 4)]
            z = x + y
            for i in z:
                answer = self.decimal('binary',i)
                if answer >= 10:
                    string = ['A','B','C','D','E','F']
                    ind = answer - 10
                    ANSWER += string[ind]
                else:
                    ANSWER += str(answer)
            return ANSWER
        
        #FROM OCTAL TO HEXADECIMAL
        elif kind == 'octal':
            given = str(given)
            new_given = ''
            x = []
            multiplier = 0
            for i in given:
                to_binary = self.binary('octal',i)
                multiplier = 3 - len(to_binary)
                new_given += '0'*multiplier + to_binary
                
            if len(new_given)%4 != 0:
                var = len(new_given)%4
                for i in range(0, var, var):
                    x += [new_given[i:i + var]]
                    new_given = new_given[var:]
            y = [new_given[k:k+4] for k in range(0, len(new_given), 4)]
            z = x + y
            for i in z:
                answer = self.decimal('binary',i)
                if answer >= 10:
                    string = ['A','B','C','D','E','F']
                    ind = answer - 10
                    ANSWER += string[ind]
                else:
                    ANSWER += str(answer)
            return ANSWER
        
    #MAIN INTERFACE
    def conversion(self):
        while True:
            #GETS THE GIVEN
            print('\nNumber System Converter')
            given = input('Enter the given: ')
            if given == 'exit':
                print('Exiting the program.')
                break
            
            #GETS THE TYPE OF GIVEN (DECIMAL, BINARY, OCTAL, HEXADECIMAL)
            kind = input('From: ')
            kind = kind.lower()
            if kind == 'exit':
                print('Exiting the program.')
                break
            
            #GETS THE TARGET NUMBER SYSTEM
            choice = input('To: ')
            choice = choice.lower()
            if choice == 'exit':
                print('Exiting the program.')
                break
            
            #PROCESSES THE GIVEN
            if choice == 'decimal':
                answer = self.decimal(kind, given)
                print(f'Decimal: {int(answer)} (base 10)')
        
            elif choice == 'binary':
                answer = self.binary(kind, given)
                print(f'Binary: {int(answer)} (base 2)')
            
            elif choice == 'octal':
                answer = self.octal(kind, given)
                print(f'Octal: {int(answer)} (base 8)')
            
            elif choice == 'hexadecimal':
                answer = self.hexa(kind, given)
                print(f'Hexadecimal: {int(answer)} (base 16)')

converted = Converter()
converted.conversion()