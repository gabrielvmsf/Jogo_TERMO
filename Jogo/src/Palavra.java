import java.text.Normalizer;
import java.util.Random;
import java.util.regex.Pattern;

public class Palavra {
    private String[] palavras;
    private String text;
    private String palavraEscolhida;

    public Palavra() {
        this.text = "sagaz,âmago,negro,êxito,mexer,termo,nobre,senso,algoz,afeto,ética,plena,mútua,tênue,sutil,vigor,fazer,aquém,porém,assim,audaz,seção,sanar,cerne,fosse,inato,ideia,poder,moral,desde,justo,muito,torpe,honra,sobre,quiçá,fútil,razão,anexo,etnia,ícone,sonho,égide,tange,amigo,lapso,mútuo,expor,haver,casal,hábil,dengo,tempo,seara,então,pesar,ávido,ardil,boçal,genro,posse,coser,causa,pária,dizer,corja,prole,brado,dever,óbice,tenaz,saber,graça,detém,crivo,ápice,ânimo,digno,comum,ânsia,ceder,temor,sendo,culto,assaz,atroz,gleba,pauta,mundo,ainda,censo,fugaz,estar,valha,cozer,vício,forte,denso,neném,vulgo,revés,pudor,regra,dogma,louco,criar,xibiu,banal,saúde,clava,round,jeito,atrás,impor,ordem,mercê,pedir,pífio,tenro,apraz,desse,usura,feliz,reaça,homem,servo,sábio,prosa,juízo,coisa,mesmo,viril,presa,ontem,cunho,manso,forma,falar,devir,limbo,meiga,afago,fluir,ébrio,posso,vendo,platô,sério,guisa,mágoa,herói,visar,puder,acaso,valor,temer,certo,pleno,cisma,lugar,ímpio,afins,bruma,todos,óbvio,êxodo,gerar,obter,crise,matiz,praxe,abrir,garbo,senil,falso,havia,fluxo,vênia,enfim,tédio,fácil,legal,ritmo,união,álibi,tomar,visão,burro,pulha,parvo,valia,reter,bravo,vital,favor,olhar,prumo,gênio,grato,parco,laico,vivaz,levar,casta,reles,possa,morte,ameno,tecer,óbito,prime,noção,ranço,sábia,falta,selar,linda,fator,anelo,façam,brega,cabal,noite,achar,nicho,farsa,rogar,citar,ouvir,coeso,viver,adiar,épico,cisão,ajuda,fardo,força,ativo,sinto,passo,calma,gente,leigo,haste,tendo,único,sonso,dúbio,exato,pobre,carma,outro,amplo,sesta,cesta,imune,sulco,rever,lavra,revel,deter,humor,vemos,labor,tende,gesto,árduo,ciúme,atuar,feixe,velho,claro,ótica,igual,ponto,ideal,hiato,débil,toada,sonsa,vácuo,terra,terno,ambos,cauda,remir,varão,marco,fonte,senão,jovem,capaz,fusão,líder,probo,inata,leito,advém,ficar,horda,xeque,farão,doido,tenra,relva,velar,algum,vazio,série,apoio,coçar,caçar,tanto,papel,pouco,entre,vimos,anuir,frase,rigor,verso,sente,raiva,botar,coesa,dorso,signo,cruel,torço,massa,feito,moção,minha,prece,fauna,credo,ambas,preso,ímpar,covil,brisa,morar,casto,peste,ciclo,vírus,lazer,blasé,chata,faina,nossa,furor,dócil,maior,trama,flora,vetor,árido,pegar,houve,adeus,chuva,beata,manha,setor,aceso,banzo,seita,liame,meses,vulto,senda,livro,sorte,ardor,breve,salvo,pecha,vasto,carro,peixe,visse,birra,comer,morro,plano,antro,saiba,prado,reger,ocaso,nunca,átomo,rezar,segue,pajem,aliás,avaro,saída,ótimo,junto,áureo,mudar,chulo,sinal,acima,serão,opção,lenda,anciã,parar,fruir,grupo,treta,nação,fitar,jazia,fugir,andar,brava,leite,bando,campo,puxar,prazo,parte,gerir,rapaz,tosco,norma,alude,motim,tenso,época,praia,ídolo,exame,sinhá,risco,tirar,vilão,agora,arcar,avião,malta,anais,psico,reino,praga,venal,antes,índio,quota,aonde,soldo,corpo,logro,preto,quase,cheio,sumir,traga,voraz,texto,filho,fixar,pompa,certa,virão,prova,turba,cópia,estão,conta,verbo,oásis,apego,áurea,exijo,nódoa,acesa,alado,caixa,solto,ligar,turva,festa,messe,nível,átrio,perda,coito,tocar,grave,oxalá,manhã,apelo,verve,lindo,fraco,doído,fatos,livre,afora,parva,pardo,trupe,fatal,mente,dessa,parca,fenda,opaco,sabia,tinha,elite,alçar,magia,jirau,navio,viria,lidar,astro,faixa,firme,ficha,glosa,autor,ético,supra,retém,grata,bater,verba,salve,reses,cioso,pique,longe,calda,junco,cousa,deixa,vezes,macio,atual,irmão,douto,privê,pagão,sexta,sarça,bicho,posto,molho,porta,torso,supor,abriu,cânon,light,judeu,extra,curso,locus,caber,besta,nosso,bioma,asilo,turvo,ígneo,órfão,abuso,drops,rádio,desta,vosso,vídeo,combo,zelar,rouca,pisar,bônus,culpa,ruína,vinha,menos,júlia,baixo,agudo,paira,ereto,calão,finda,advir,gosto,estio,facto,super,facho,feudo,sítio,traço,suave,urgia,cútis,surja,meigo,tetra,amena,turma,pilar,tento,rumor,autos,louça,chama,ações,cocho,museu,clean,mosto,lápis,pódio,local,acolá,lasso,geral,hobby,optar,boato,medir,aluno,refém,brabo,páreo,drama,chato,peito,rubro,mesma,folga,pacto,crime,poema,piada,ponha,ávida,metiê,penta,letal,móvel,teste,cacho,feroz,golpe,coral,vigia,aroma,clima,hoste,monte,pasmo,passa,vetar,açude,poeta,rival,fazia,cover,cetro,verde,ecoar,daqui,riste,troça,lição,forem,finjo,fórum,carta,tacha,axila,monge,ateia,plebe,artur,calmo,busca,súcia,idoso,ébano,swing,escol,tribo,plumo,lesse,falha,briga,venha,roupa,aviso,conto,macro,tarde,plaga,sarau,perco,cargo,chefe,fruto,amiga,átimo,vento,farta,viram,civil,légua,grama,pedra,única,berro,virar,manga,arado,ornar,catre,saldo,seixo,sósia,casar,bença,surto,troca,corso,fosso,beijo,traje,nuvem,magna,estro,assar,úteis,mangá,bruta,tiver,gíria,itens,deste,recém,pinho,trato,porte,tição,vazão,vedar,tutor,amado,depor,arfar,jejum,silvo,canso,bazar,renda,perto,irado,âmbar,gabar,deram,grota,mídia,amada,bruto,cifra,rural,inter,feita,areia,laudo,órgão,pavor,tchau,nesse,bucho,régio,pasma,fossa,clero,stand,segar,odiar,minar,vadio,vagar,pomar,troco,molde,close,rocha,aviar,xucro,canto,mamãe,negar,guria,sótão,cenho,lesão,jogar,visto,bolsa,densa,lesto,cinto,proto,largo,paiol,morfo,chula,marca,horto,invés,ruído,volta,vista,ileso,pugna,penso,urdir,podar,vasta,ufano,cheia,mocho,varoa,cível,frota,úbere,tenha,velha,santo,logos,bulir,úmido,piche,linha,esgar,natal,ferpa,ágape,apear,cerca,nessa,fundo,resto,verão,peita,pólis,narco,nesta,misto,etapa,manto,símio,jazer,coroa,monta,ceita,ardis,letra,canil,demão,preço,final,trago,troço,chaga,barão,findo,lábia,gemer,matar,campa,álamo,banto,mover,seiva,álbum,cosmo,fazes,redor,todas,salmo,venho,folia,dança,porca,barro,áudio,folha,retro,burra,punha,axial,sabor,bolso,louro,limpo,queda,calor,neste,rente,farol,arroz,lousa,salva,calça,firma,lutar,mimar,sigla,coevo,zumbi,calvo,torna,enjoo,baixa,macho,míope,solta,veloz,justa,fugiu,ousar,tumba,gueto,logia,longo,nácar,chave,corar,bedel,reler,vazia,forro,fátuo,penca,farto,vário,lucro,sexto,cacto,obtém,mania,repor,subir,urgir,sugar,quite,custo,sofia,puído,passe,ultra,valer,staff,louca,sadio,nariz,versa,cardo,harém,usual,refil,viger,hífen,lento,dados,modal,outra,corte,sócio,rédea,choça,ferir,ceifa,diabo,garra,nesga,mouro,aéreo,voilà,abade,sabiá,skate,pátio,anzol,pluma";
        this.palavras = text.split(",");
        this.palavraEscolhida = aleatoriezarPalavra();
    }

    private String aleatoriezarPalavra() {
        Random rand = new Random();
        int i = rand.nextInt(0, palavras.length - 1);
        return palavras[i];
    }

    public String removeAccentsBeforeJava7(String value) {
        String normalizer = Normalizer.normalize(value, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("[^\\p{ASCII}]");
        return pattern.matcher(normalizer).replaceAll("");
    }

    public String[] getpalavras() {
        return this.palavras;
    }

    public void setpalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getpalavraEscolhida() {
        return this.palavraEscolhida;
    }

    public void setpalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
    }

    public String[] getPalavras() {
        return this.palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public String getPalavraEscolhida() {
        return this.palavraEscolhida;
    }

    public void setPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
    }

}