package Heranca;

public class Main {

	public static void main(String[] args) {

		Fornecedor forne = new Fornecedor("Yudi", "Rua Tchurusbangos", "4002-8922", 1000.0, 500.0);
		
		System.out.println("Nome: " + forne.getNome());
		System.out.println("Endereço: " + forne.getEndereco());
		System.out.println("Telefone: " + forne.getTelefone());
		System.out.println("Valor de Crédito: " + forne.getValorCredito());
		System.out.println("Valor de Dívida: " + forne.getValorDivida());
		System.out.println("Saldo: " + forne.obterSaldo());
		
		Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "Rua A", "123456789", 1000.0, 500.0);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Endereço: " + fornecedor.getEndereco());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Valor de Crédito: " + fornecedor.getValorCredito());
		System.out.println("Valor de Dívida: " + fornecedor.getValorDivida());
		System.out.println("Saldo: " + fornecedor.obterSaldo());
		
		Empregado empregado = new Empregado("Adelino", "Not Found, Rua HttP ", "404-404", 01, 1000.0, 1.0);

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Nome: " + empregado.getNome());
		System.out.println("Endereco: " + empregado.getEndereco());
		System.out.println("Telefone: " + empregado.getTelefone());
		System.out.println("CodigoSetor: " + empregado.getCodigoSetor());
		System.out.println("Salario Base: " + empregado.getSalarioBase());
		System.out.println("Imposto: " + empregado.getImposto());
		System.out.println("Salario: " + empregado.calcularSalario());
		
		Administrador administrador = new Administrador("Darius", "Noxus", "1111 7777", 234, 2500.0, 15.0, 300.0);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Endereco: " + administrador.getEndereco());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("CodigoSetor: " + administrador.getCodigoSetor());
		System.out.println("Salario Base: " + administrador.getSalarioBase());
		System.out.println("Imposto: " + administrador.getImposto());
		System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
		System.out.println("Salario Liquido: " + empregado.calcularSalario());
		
		Operario operario = new Operario("Mordekaiser", "Ilhas das Sombras", "6666-6666", 100 , 10000.0, 12.0, 1000.0, 5.0);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor de Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário Líquido: " + operario.calcularSalario());
		
        Vendedor vendedor = new Vendedor("Vendedor 1", "Rua E", "987654321", 456, 1700.0, 10.0, 1500.0, 3.0);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());

	}

}
