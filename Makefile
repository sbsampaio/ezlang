CC=javac
JAVA=java
ANTLR_PATH=$(CURDIR)/../tools/antlr-4.13.2-complete.jar
CLASS_PATH_OPTION=-cp .:$(CURDIR)/bin:$(ANTLR_PATH)
ANTLR4=$(JAVA) -jar $(ANTLR_PATH)
GRUN=$(JAVA) $(CLASS_PATH_OPTION) org.antlr.v4.gui.TestRig
GRAMMAR_NAME=EZ
LEXER_FILE=$(GRAMMAR_NAME)Lexer.g
PARSER_FILE=$(GRAMMAR_NAME)Parser.g
GEN_PATH=src/parser

# Executa o ANTLR e o compilador Java
all: antlr javac
	@echo "Done."

# Executa o ANTLR para compilar a gramática
antlr: $(LEXER_FILE) $(PARSER_FILE)
	$(ANTLR4) -no-listener -visitor -o $(GEN_PATH) $(LEXER_FILE) $(PARSER_FILE)

# Executa o javac para compilar os arquivos gerados
javac:
	$(CC) -d bin $(CLASS_PATH_OPTION) src/*.java src/*/*.java $(GEN_PATH)/*.java

# Executa o front-end. Comando: $ make run FILE=arquivo_teste
run:
	$(JAVA) $(CLASS_PATH_OPTION) App $(FILE)

# Executa o TestRig para exibir a parse tree
debug:
	cd $(BIN_PATH) && $(GRUN) parser.$(GRAMMAR_NAME) program -tree -gui $(FILE)

# Remove os arquivos gerados pelo ANTLR
clean:
	@rm -rf $(GEN_PATH) bin
